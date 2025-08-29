# 📧 Email AutoWriter  
*AI-powered email reply generator built with Spring Boot, HTML/JS, and a Gmail Chrome Extension.*  

![Java](https://img.shields.io/badge/Java-21-orange?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen?logo=springboot)
![Frontend](https://img.shields.io/badge/Frontend-HTML%2FCSS%2FJS-blue)
![Extension](https://img.shields.io/badge/Chrome-Extension-lightgrey?logo=googlechrome)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## 📸 Preview
<img width="959" height="650" alt="Screenshot 2025-08-29 224713" src="https://github.com/user-attachments/assets/07cefe3d-542f-426b-8fc0-57a6ac1aca79" />
<img width="1000" height="946" alt="Screenshot 2025-08-30 003004" src="https://github.com/user-attachments/assets/ad70ccd3-23ae-4e07-8710-7e5c67bd041a" />



---

## ✨ Features
- 📧 **AI-powered email reply generation** (Google Gemini API)  
- 🎨 Tone customization → `formal`, `friendly`, `concise`, etc.  
- 🖥 Works both as a **standalone web app** and a **Gmail Chrome Extension**  
- ⚡ Fast & lightweight UI (HTML, CSS, JavaScript)  
- 🔌 REST API backend built on **Spring Boot**  
- 📂 Easy integration with Gmail via **Chrome Extension**  

---

## 🛠 Tech Stack
### Backend:
- Java 21  
- Spring Boot 3.4.5  
- Maven  

### Frontend:
- HTML5  
- CSS3  
- JavaScript (Fetch API for backend calls)  

### Integration:
- Google Gemini API  
- Chrome Extension (Manifest V3) 

## 📂 Project Structure
email-autowriter/
├── backend/
│ ├── src/main/java/com/email/autowriter/
│ │ ├── EmailAutoWriterApplication.java
│ │ └── app/
│ │ ├── EmailGeneratorController.java
│ │ ├── EmailGeneratorService.java
│ │ ├── EmailRequest.java
│ ├── src/main/resources/
│ │ └── application.properties
│ └── pom.xml
│
├── frontend/
│ ├── index.html
│ ├── style.css
│ └── script.js
│
├── extension/ # Gmail Chrome Extension
│ ├── manifest.json
│ ├── content.js
│ ├── popup.html
│ ├── popup.js
│ └── icon.png
