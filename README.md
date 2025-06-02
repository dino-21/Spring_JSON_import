
![7](https://github.com/user-attachments/assets/52a56ccc-36ab-4cce-892e-9ac9514d1008)



![8](https://github.com/user-attachments/assets/d743df6e-a416-4aba-9223-b7bb1280c959)



![9](https://github.com/user-attachments/assets/fdef20f6-7a17-4447-9227-607df1b9b80e)



json데이터  - https://dino-21.github.io/Json_data/pm1.json

pom.xml
<!-- JSON 파싱의 핵심 기능을 제공하는 Jackson의 코어 라이브러리 -->
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-core</artifactId>
			<version>2.13.5</version>
		</dependency>

		<!-- @JsonProperty, @JsonIgnore 등의 Jackson 어노테이션을 사용할 수 있게 해주는 라이브러리 -->
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-annotations</artifactId>
			<version>2.13.5</version>
		</dependency>

		<!-- ObjectMapper를 포함한 데이터 바인딩 기능을 제공하는 핵심 라이브러리 -->
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.13.5</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok getter, 
			setter, 생성자 등의 코드를 간소화 -->
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.30</version>
			<scope>provided</scope>
		</dependency>
