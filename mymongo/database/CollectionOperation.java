package com.wjw.complete5.mymongo.database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.wjw.complete5.mymongo.configuration.Channels;
import com.wjw.complete5.mymongo.configuration.MoreConfiguration;
import com.wjw.complete5.mymongo.configuration.NewsConfiguration;
import com.wjw.complete5.mymongo.util.RequestOperation;
import org.apache.log4j.Logger;
import org.bson.Document;

import java.util.*;


/**
 * Author:JiawangWang
 *
 * @ Description: 对数据库中的每个频道进行增删改查
 * @ Date: Create in 16:14 2018/1/24
 *
 */
public class CollectionOperation implements ICollectionOperation {
    private MongoClient client = new MongoClient("127.0.0.1",27017);
    private List<String> articleIdList = new ArrayList<>();
    private Logger logger = Logger.getLogger(CollectionOperation.class);
    @Override
    public void updateAllCollection() {
        for(Channels channels: Channels.values()) {
            updateToCollection(channels);
        }
    }

    @Override
    public void dropAllCollection() {
        for(Channels channels: Channels.values()) {
            dropToCollection(channels);
        }
    }

    @Override
    public void addAllCollection() {
        for(Channels channel: Channels.values()) {
            addToCollection(channel);
        }
    }

    @Override
    public void findAllCollection() {

    }

    @Override
    public void updateToCollection(Channels channels) {
        MongoCollection<Document> collection = getMongoCollection(channels);
        collection.drop();
        addToCollection(channels);
    }

    @Override
    public void dropToCollection(Channels channels) {
        MongoCollection<Document> collection = getMongoCollection(channels);
        collection.drop();
    }

    @Override
    public void addToCollection(Channels channels) {
        Document document = getBaseDocument(channels);
        List<Document> moreDocumentList = new ArrayList<>();
        for(MoreConfiguration configuration : MoreConfiguration.values()) {
            Document document1 = getDocumentMore(configuration,channels);
            if(document1 == null) {
                break;
            }else {
                moreDocumentList.add(document1);
            }
        }
        MongoCollection<Document> collection = getMongoCollection(channels);
        if(document != null) {
            collection.insertOne(document);
        }
        collection.insertMany(moreDocumentList);

    }

    @Override
    public void findToCollection(Channels channels) {

    }

    /**
     * 还未进行网络判断
     * @param intervals 间隔
     */
    @Override
    public void constantlyUpdate(int intervals) {

    }

    /**
     * 0点更新数据库.未判断网络
     */
    @Override
    public void regularlyUpdated() {
        MyTask task = new MyTask(()->updateAllCollection());
        task.startTask();
    }

    /**
     * 获取Document文件
     * @param channels 频道
     * @return 字符串转换为对应的文件(主文件)
     */
    private Document getBaseDocument(Channels channels) {
        String formString = FormString.stringProcessing(RequestOperation.getResponse(NewsConfiguration.getBaseUrl(channels)));
        return formString != null ? Document.parse(formString):null;
    }

    /**
     * 获取Document文件
     * @param channels 频道
     * @return  字符串转换为对应的文件（更多的文件2）
     */
    private Document getDocumentMore(MoreConfiguration configuration,Channels channels) {
        String formString = FormString.stringProcessing(RequestOperation.getResponse(NewsConfiguration.getMoreNewsUrl(configuration,channels)));
        return formString != null ? Document.parse(formString):null;
    }

    /**
     * 获取频道相对应的集合
     * @param channels 频道
     * @return mongo中的表集合
     */
    private MongoCollection<Document> getMongoCollection(Channels channels) {
        MongoDatabase database = client.getDatabase(channels.getDatabaseName());
        return database.getCollection(channels.getCollectionName());
    }

}