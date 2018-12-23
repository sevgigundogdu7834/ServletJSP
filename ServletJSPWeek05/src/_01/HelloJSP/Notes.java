package _01.HelloJSP;

public class Notes {

    // JSP-> Java Server Pages
    // JSF-> Java Server Faces bunlar farklı teknolojiler!
    // bu iki kavram da JAVA EE nin bir bölümüdür.

     // JSP -> web pages
    // servletler ile çalışırken , java kodları arasına html kodları yazıyorduk
    // jsp dosyalarında html kodları arasına java kodları yazabiliyoruz.

    // FreeMarker,Apache Velocity,Apache Tiles,Thymeleaf

    // Request Dispatch !
    // controllerdan istek -> jsp diğer view layer framework'une dispatch edilir.

    // view layer
    // view layer, son kullanıcıya datayı göster ya da son kullanıcıdan data al (form)
    // bunun dığındaki işleri view layerda(jsp) yapma
    // en çok yapılanlar; veritabanına bağlanmak,yanlış hareket!

    // mvc deki temel  noktalardan bir tanesi ; seperation of concern

    // jsp dosyaları Servlet Container tarafından Servlet sınıflarına (.class) translate edilir.
    // sonrasında compile edilir.

    // -------JSP GRAMERİ------------

    // JSP Scriplet kullanırız.
    // JSP sayfalarımızda java kodu yazabiliriz bunun için scriplet kullanmamız gereklidir.
    // genel format;

    // <% java code %>

    // ---------JSP EXPRESSİON----------

    // tarayıcıya direkt veri yazmak için kullanılır.

    // <%=expression%>

    // -----------JSP DECLARATİON---------

    // instance variable ya da instance method tanımlanabilir.

    // <%! jsp declaration %>

    // -----------JSP ACTİON--------------

    //< jsp:action_name attribute="" >

    // _____________JSP COMMENT-----------

    // genel format;
    // <%-- --%>

    // -------------HTML COMMENT-------------

    // <!-- -->

    //------------JSP DİRECTİVE------------
    // <%@ %>

    // <%@ page
    // <%@ include
    // <%@ taglib






}
