package io.diego.duarte.springbootsftp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//@Component
//public class TestSftpFileTransfer implements CommandLineRunner {
//
    /*private final Logger logger = LoggerFactory.getLogger(TestSftpFileTransfer.class);

    @Autowired
    private FileTransferService fileTransferService;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Start download file");
        boolean isDownloaded = fileTransferService.downloadFile("/home/diego/readme.txt", "/upload/readme.txt");
        logger.info("Download result: " + String.valueOf(isDownloaded));

        logger.info("Start upload file");
        boolean isUploaded = fileTransferService.uploadFile("/home/diego/readme.txt", "/upload/vai.txt");
        logger.info("Upload result: " + String.valueOf(isUploaded));
    }*/
//}
