package _03_lifecycle;

public class Notes {

    // lifecycle;
    // container , servlet class dosyalarını bulur.
    // sonrasında loading işlemi yapılır.


    // 1) Servlet;

    // public olmak zorundadır.
    // public no-args constructor olmak zorundadır.
    // genel olarak servletlerde constructor tanımlanmaz.
    // constructor yerine init methodu tercih edilir.

    // 2) Servlet Inıtıalize;

    //Inıtıalize mantığına birçok projede ihtiyacımız olacaktır.
    //proje ayağa kalkarken, istek karşılanmadan önce ilgili servlet ilk defa çalışmadan önce vs
    //bir konfigürasyon yapmak isteriz bu mantığa initialize mantığı denir.

    // void init(ConfigServlet var1) throws ServletException;

    // public void init() throws ServletException {
    //    }

    //init methodu lifecycle boyunca sadece bir kez çalışır.

    // 3) Servising;
    //    servlet objesi oluştu
    //    servlet initialize oldu
    //    bu noktadan sonra artık istekler karşılanabilir.(handle request)

    //    service methodunu override etme !!!
    //    gelen her isteğe karşılık bir Thread oluşur.
    //    her servlet için sadece bir tane instance oluşur.

    //    her istek bir thread- sadece bir tane obje

    // 4) doGet doPost methodu çalışır.

}
