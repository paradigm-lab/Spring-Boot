package com.filemanagement.controller;

import com.filemanagement.entity.Attachment;
import com.filemanagement.model.ResponseData;
import com.filemanagement.service.AttachmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AttachmentController {
    private AttachmentService attachmentService;

    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    @PostMapping("/upload")
    public ResponseData uploadFile(@RequestParam("file")MultipartFile file) {
        Attachment attachment = null;
        attachment = attachmentService.saveAttachment(file);
    }
}
