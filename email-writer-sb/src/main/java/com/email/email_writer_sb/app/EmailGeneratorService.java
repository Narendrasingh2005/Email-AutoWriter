package com.email.email_writer_sb.app;

import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorService {

    public String generateEmailReply(EmailRequest emailRequest)
    {
        // Yaha promt ka code ayega
        String prompt = buildRequest(emailRequest);

        // craft a request 

        // Do request  and get response

        // Return response
    }

    private String buildRequest(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a Professional Email Reply for the following email content.please don't generate the subject line ");

        if (emailRequest.getTone() != null && emailRequest.getTone().isEmpty()) {
            prompt.append("Use a").append(emailRequest.getTone()).append("tone.");

        }
        prompt.append("\n Original email: \n").append(emailRequest.getEmailContent());

        return prompt.toString();
    }
}
