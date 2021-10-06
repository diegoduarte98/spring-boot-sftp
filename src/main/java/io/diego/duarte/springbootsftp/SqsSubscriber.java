package io.diego.duarte.springbootsftp;

import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqsSubscriber {

    private final Logger logger = LoggerFactory.getLogger(SqsSubscriber.class);

    @Autowired
    private FileTransferService fileTransferService;

    @SqsListener(value = "${cloud.aws.queue.pocsftp}",deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void subscribeToSQSDirectly(final String msg) {
        logger.info(msg);

        /*logger.info("Start download file");
        boolean isDownloaded = fileTransferService.downloadFile("/home/diego/readme.txt", "/upload/readme.txt");
        logger.info("Download result: " + String.valueOf(isDownloaded));*/

        logger.info("Start upload file");
        boolean isUploaded = fileTransferService.uploadFile("/home/diego/readme.txt", "/upload/vai.txt");
        logger.info("Upload result: " + String.valueOf(isUploaded));

        //TODO Criptografia

        //TODO Enviar para o S3
    }
}
