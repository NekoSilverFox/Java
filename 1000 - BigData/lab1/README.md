

# Лабораторная № 1

> Мэн Цзянин 5140904/30202

Реализация программного средства для обфускирования и де-обфускирования данных.

В данной реализации для считывания XML файлов использовалась библиотека jdom2. Процесс обфускации состоит из шифрования 
данных с помощью AES и их дальнейшего кодирования в BASE64.

## Результат

**Исходный файл:**

```xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<employees>
  <employee id="111">
    <firstName>Lokesh</firstName>
    <lastName>Gupta</lastName>
    <location>India</location>
  </employee>
  <employee id="222">
    <firstName>Alex</firstName>
    <lastName>Gussin</lastName>
    <location>Russia</location>
  </employee>
  <employee id="333">
    <firstName>David</firstName>
    <lastName>Feezor</lastName>
    <location>USA</location>
  </employee>
  <employee id="444">
    <firstName>Tom</firstName>
    <lastName>Cat</lastName>
    <location>USA</location>
  </employee>
  <employee id="555">
    <firstName>Jarry</firstName>
    <lastName>Mouse</lastName>
    <location>USA</location>
  </employee>
</employees>

```



**Обфусцированный исходный файл:**

```xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<employees>
  <employee id="111">
    <firstName>L01mca7TMJHJbrb2m6YVfA</firstName>
    <lastName>zzH4c/NMvy9gDxUbZd8g8A</lastName>
    <location>DdRrWhmTbw9s+pZFBBMc6w</location>
  </employee>
  <employee id="222">
    <firstName>VjuvVdnQ3oBAS7qJOUC6yg</firstName>
    <lastName>BSL8eH+KpGcbFovAMW6RhQ</lastName>
    <location>LNL4ztVIJjfp7IUJhuiMgA</location>
  </employee>
  <employee id="333">
    <firstName>19EhjBZJXWXHv0Bn2J6nug</firstName>
    <lastName>w7KEsgP4qg0utXkO3Umudg</lastName>
    <location>FtVlCAaZTGDtItwvpDCjgg</location>
  </employee>
  <employee id="444">
    <firstName>mDGn6IiRVlVDcbE3B5TCsQ</firstName>
    <lastName>B4f/+iZaO4asL/OzlCN89w</lastName>
    <location>FtVlCAaZTGDtItwvpDCjgg</location>
  </employee>
  <employee id="555">
    <firstName>8CuAb+gH2AMOFrMKVsJMHg</firstName>
    <lastName>+/3qIrkrR2YAcYv5of/jdQ</lastName>
    <location>FtVlCAaZTGDtItwvpDCjgg</location>
  </employee>
</employees>

```



**Де-обфусцированный исходный файл:**

```xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<employees>
  <employee id="111">
    <firstName>Lokesh</firstName>
    <lastName>Gupta</lastName>
    <location>India</location>
  </employee>
  <employee id="222">
    <firstName>Alex</firstName>
    <lastName>Gussin</lastName>
    <location>Russia</location>
  </employee>
  <employee id="333">
    <firstName>David</firstName>
    <lastName>Feezor</lastName>
    <location>USA</location>
  </employee>
  <employee id="444">
    <firstName>Tom</firstName>
    <lastName>Cat</lastName>
    <location>USA</location>
  </employee>
  <employee id="555">
    <firstName>Jarry</firstName>
    <lastName>Mouse</lastName>
    <location>USA</location>
  </employee>
</employees>

```



