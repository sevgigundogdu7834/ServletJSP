package _02_;

public class HandleRequest {

    // Handle Request;

       // 1) Son kullanıcı servleti çağıran bir url e tıklar.

       // 2) Servler Container bu isteğe karşılık 2 tane obje oluşturu.
       //      1) HttpServletRequest
       //      2) HttpServletResponse

       // 3) Servlet Container yeni bir thread oluşturur.service methodunu çağırır reguest ve response bu methoda geçer.

       //  4) Gelen istek bir GET isteği ise doGet
       //     POST isteği ise doPost

       // 5) ilgili method çalışır, doGet,doPost
       //    istek karşılanır.


       // 6) service methodu sonlanır.
       //    thread sonlanır.
       //    request ve response objeleri artık Garbage Collector tarafından temizlenebilir.



}
