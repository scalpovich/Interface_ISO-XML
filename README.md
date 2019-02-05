# Interface_ISO-XML
Interface for ISO8583 to XML conversion

Run as Spring Boot App.
Post message on REST endpoint http://umeshs-macbook-pro.local:8080/iso/ or http://localhost:8080/iso/

Sample ISO8583 Message:
01007E2440010E408000164000000000000002000000000000001000000000001000000000001000022717352012345620125999111234567890112345678901212345600123456789012345840

Reference:
Using MsgUtils class from to make final transformation to XML.
https://github.com/wakantanka/get_iso_8583/blob/master/src/main/java/com/wirecard/acqp/two/MsgUtils.java
