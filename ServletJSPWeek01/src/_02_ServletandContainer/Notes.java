package _02_ServletandContainer;

public class Notes {

}

// Servletler java sınıflarıdır.

//Servletler ile en basit haliyle dinamik/dynamic bir içerik üretme işlemini yaparız.

//Servletlerin main metodu yoktur, bütün kontrol Servlet Container 'in kontrolü altındadır.

//-----Servlet container /Servlet Engine

//Servera bir istek geldiğinde , gelen istek eğer bir Servleti ya da JSP ' yi tetikliyorsa bu durumda isteği Servlet Container/Servlet Engine karşılar.

// ---> communication support
// servlet ile server arasındaki iletişimi sağlar.
//böylece port dinle,stream oluştur,http protokolüne göre kodu yaz,soket aç vs. işlemler gerekmez.

// ---> lifecycle management
//servletlerin bütün yaşam döngüsü containerın sorumluluğu altındadır.

//---> multithread support
//her istek geldiğinde bir thread oluşturur.

//---> jsp support
//container, jsp dosyalarını translate eder.

