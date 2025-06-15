
---

## 💱 Conversor de Monedas

> Proyecto desarrollado en Java como parte del **Challenge ONE - Oracle Next Education**, el cual permite convertir entre diferentes monedas internacionales utilizando la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/).

---

### 📌 Funcionalidades

✅ Conversión entre las siguientes monedas:

* USD ⇄ CRC (Colón Costarricense)
* USD ⇄ ARS (Peso Argentino)
* USD ⇄ BRL (Real Brasileño)
* USD ⇄ COP (Peso Colombiano)

✅ Comunicación con API externa en tiempo real

✅ Menú interactivo desde consola

✅ Validaciones de entrada y errores elegantes

✅ Diseño visual atractivo en terminal

---

### 🎬 Captura en consola

```
╔══════════════════════════════════════════════════════════════╗
║              BIENVENIDO AL SISTEMA DE CONVERSOR DE MONEDAS   ║
╠══════════════════════════════════════════════════════════════╣
║  1) Dólar (USD)           → Colón Costarricense (CRC)        ║
║  2) Colón Costarricense   → Dólar (USD)                      ║
║  3) Dólar (USD)           → Peso Argentino (ARS)             ║
║  4) Peso Argentino        → Dólar (USD)                      ║
║  5) Dólar (USD)           → Real Brasileño (BRL)             ║
║  6) Real Brasileño        → Dólar (USD)                      ║
║  7) Dólar (USD)           → Peso Colombiano (COP)            ║
║  8) Peso Colombiano       → Dólar (USD)                      ║
║  9) Salir                                                    ║
╚══════════════════════════════════════════════════════════════╝
```

---

### ⚙️ Tecnologías utilizadas

* Java 21
* Maven
* API REST (ExchangeRate-API)
* GSON (para parseo de JSON)
* Java HTTP Client (`java.net.http`)

---

### 🚀 Cómo ejecutar el proyecto

1. Clona este repositorio:

```bash
git clone https://github.com/tu-usuario/conversor-monedas.git
cd conversor-monedas
```

2. Compila el proyecto con Maven:

```bash
mvn clean compile
```

3. Ejecuta la clase principal:

```bash
mvn exec:java -Dexec.mainClass="org.example.Main"
```

> Asegúrate de tener una conexión a internet para que la API funcione correctamente.

---

### 📦 Dependencias clave (en `pom.xml`)

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.13.1</version>
</dependency>
```

---

### 👤 Autor

* **Kendra Artavia Caballero**

   Desarrolladora y estudiante de informática. Participante del programa **Oracle Next Education - Alura Latam**.

---

### 🏁 Proyecto Challenge ONE

Este proyecto forma parte del desafío **Conversor de Moneda** del programa de formación **Oracle Next Education** en alianza con **Alura Latam**.
Su objetivo es aplicar conocimientos de Java, buenas prácticas de programación y consumo de APIs externas.

---
