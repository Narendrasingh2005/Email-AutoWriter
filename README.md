# 📧 Email AutoWriter

A **Spring Boot + HTML/JS frontend + Gmail Chrome Extension** project that generates **professional email replies** using **Google Gemini API**.  
It allows you to run a standalone web UI **or** install as a **Gmail extension** for live email reply generation.

---

## 🚀 Features
- Backend: Spring Boot REST API
- Frontend: HTML, CSS, JavaScript
- Gmail Integration: Chrome Extension
- AI-powered email reply generation (via Google Gemini API)
- Tone customization (`formal`, `friendly`, `concise`, etc.)
- Works as:
  - A **web app**
  - A **Gmail extension**

---

## ⚙️ Tech Stack
- **Java 21**, **Spring Boot 3.4.5**, **Maven**
- **HTML / CSS / JavaScript**
- **Google Gemini API**
- **Chrome Extension (Manifest V3)**

---
## 📸 Snapshot
![Project Screenshot](./snapshots/Screenshot-2025-08-29-224713.png)

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
