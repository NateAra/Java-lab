package com.NateAra.Java2.myTube;

public class VideoProcessor {

    private final VideoEncoder encoder;
    private final EmailService emailService;
    private final VideoDatabase database;

    public VideoProcessor(VideoEncoder encoder, EmailService emailService, VideoDatabase database) {
        this.encoder = encoder;
        this.emailService = emailService;
        this.database = database;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}
