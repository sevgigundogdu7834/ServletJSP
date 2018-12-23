package _03_jspAction._02_attribute;

public class Notes {
}

// çeşitli scopelara bıraktığımız/eklediğimiz objeler; attribute

// application
// Session
// Request
// PageScope

// ## 1) Application Scope

//--  Servlet
// getServletContext.setAttribute("key",value);

// -- JSP
// application.setAttribute("key",value);

// ## 2) Session Scope

// --Servlet
// request.getSession().setAttribute("key",object);

// --JSP
// session.setAttribute("key",object);

// ## 3) Request Scope

// --Servlet
// request.setAttribute

// --JSP
// request.setAttribute

// ## 4) Page Scope

// JSP için geçerlidir.
//pageContext.setAttribute("key",object);



