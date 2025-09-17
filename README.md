# Redis Pub/Sub Pattern Subscription Explained 🔥 | Subscribe Multiple Channels in Spring Boot 🌿 Hindi Tutorial  

Welcome to **[Backend Verse](https://www.youtube.com/@BackendVerse)**! 🎥  
In this tutorial, we explore how to implement **Redis Pub/Sub with Star Pattern Using Spring Boot** to enable **real-time communication** between services and applications. 🚀
---

## ▶ Watch the Tutorial

📺 **[Redis Pub/Sub Pattern Subscription Explained 🔥 | Subscribe Multiple Channels in Spring Boot 🌿 Hindi Tutorial](https://youtu.be/uPMVIEfpjzo)**

---

## 📝 What You’ll Learn

📌 What is Pub/Sub in Redis
⚡ How Pub/Sub works internally
🔑 Implementing Pub/Sub with Spring Boot
🌟 Using **Pattern Subscription (`PSUBSCRIBE`)** for multiple channels
💡 Real-world use case: Live News & Sports Updates
✅ Best practices for scalable event-driven apps

---

## 🎯 Why Watch This Video?

With **Redis Pub/Sub (Pattern Subscription)**, you can:
✔️ Subscribe to multiple channels with one wildcard (e.g., `live*`)
✔️ Build real-time apps like news, sports & notifications 🚀
✔️ Avoid multiple blocking subscriptions & improve performance
✔️ Scale event-driven microservices communication easily
✔️ Integrate seamlessly with Spring Boot

---

## 🔧 Tools & Technologies Used
- Java 17
- Spring Boot
- Redis
- Gradle
- IntelliJ IDEA
- Postman
- Docker
- Docker Compose

---

## ⚙️ Project Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/backendverse/spring-boot-redis-pub-sub
   cd spring-boot-redis-pub-sub
   git checkout redisPatternSubscriber
   ```
---

## 🐳 Run with Docker Compose (Recommended)

If you don’t want to install Redis manually, you can use **Docker Compose**.

### 1️⃣ Start Redis Container

```bash
docker compose up -d
```

### 2️⃣ Verify Container is Running

```bash
docker ps
```

👉 You should see a container named **redis**.

### 3️⃣ Connect to Redis CLI inside the Container

```bash
docker exec -it <container_id> bash
redis-cli
```

✅ Now you are inside Redis! 🎉

### 4️⃣ Subscribe to Topics using Pattern Subscriber

```bash
PSUBSCRIBE live*
```

👉 Example: `live*` → will subscribe to all channels like **`live-news`**, **`live-sports`**, **`live-weather`**.

### 5️⃣ Publish Data to a Topic

```bash
PUBLISH live-sports "Latest Update: Cricket is awesome!"
```

⚡ Here, **`live-sports` is your CHANNEL name** — you can replace it with any channel (e.g., `live-news`, `live-weather`).

---

## 🔗 Example APIs

### 1️⃣ Publish Message
```bash
curl --location --request POST 'http://localhost:8080/notification?message=Breaking%20News%20and%20todays%20sports'
````

---

## ▶ Watch the Tutorials

📺 **Playlists for Complete Learning:**

👉 [Spring Boot Series](https://www.youtube.com/playlist?list=PLdUn31k8Q721HBdMQzyl403o-bUtd31Wb) 🚀

👉 [Spring Data JPA Series](https://www.youtube.com/playlist?list=PLdUn31k8Q720FEKVfXrV0DKEgP7Mp1NuX) 💾

👉 [Spring Boot Redis Series](https://www.youtube.com/playlist?list=PLdUn31k8Q721tgtkv1sfPJrvmi6-t3ijp) ⚡

---

## 📢 Stay Connected

👍 Like the video if you found it helpful  
💬 Drop your questions in the comments  
🔔 Subscribe to **[Backend Verse](https://www.youtube.com/@BackendVerse)** for more Backend tutorials in Hindi

---