package com.filemanagement.service;

import com.filemanagement.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAttachment(MultipartFile file) throws Exception;
}
