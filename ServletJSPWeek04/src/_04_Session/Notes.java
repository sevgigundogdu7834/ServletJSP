package _04_Session;

public class Notes {

    // HTTP protokolü, stateless/durumsuz bir protokoldür.

    // browser ile server arasındaki bağlantı kalıcı(persestent)  değildir.
    // browser/client istekte bulunur , bağlantı kurulur istek karşılandıktan sonra (response döndükten sonra) bağlantı kapatılır.
    // server, gelen isteği gönderen kişi daha önce istek göndermiş mi bunlarla ilgilenmez/ bilmez.
    // uygulamamızı , stateful haline getirmek için servlet apisinde HTTPSESSİON objesi yer almaktadır.

    // SessionID

    // client/browser bir istekte bulunur , container unique bir id oluşturur.
    // bu session id bilgisi response ta döner.daha sonraki isteklerde
    // client/browser bu session id bilgisi ile server a gider.

    // bu session bilgisi Cookie ler aracılığıyla taşınır/kullanılır.
    // HttpSession objesi oluşturma
    // unique session id bilgisi oluşturma
    // session id ile cookie objesini ilişkilendirme/bağlama
    // cookiye/session id responsa ekleme/dönme bütün işlemlerde Servlet Container sorumludur. !!!!!!!!!!!



}
