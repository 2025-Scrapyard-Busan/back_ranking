# 1. OpenJDK 17 이미지 사용
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 생성
WORKDIR /app

# 3. Gradle 빌드된 JAR 파일을 컨테이너로 복사
COPY build/libs/*.jar app.jar

# 4. 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]