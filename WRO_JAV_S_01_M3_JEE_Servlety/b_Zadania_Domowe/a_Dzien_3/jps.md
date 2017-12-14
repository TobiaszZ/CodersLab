<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE - Servlety

### Zadania.

Stwórz projekt `Homework_03`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1.

W projekcie stwórz stronę jsp `index1.jsp`. Następnie:
1. Pobierz wartość parametru GET o nazwie `author`.
2. Sprawdź czy parametr istnieje oraz czy nie jest pusty.
3. Wyświetl informacje w postaci:
    ```html
    <p>Wybrany autor <Pobrana wartość></p>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty	param.author}">
<p>Wybrany autor <%=request.getParameter("author")%></p>
</c:if>
<c:if test="${empty	param.author}">
<p>	Nie wybrano autora </p>
</c:if>
</body>
</html>    ```

#### Zadanie 2.

W projekcie stwórz stronę jsp `index2.jsp`. Za pomocą pętli forEach wyświetl na stronie liczby w taki sposób by uzyskać poniższy wynik. Wykorzystaj dodatkowe atrybuty pętli `begin` oraz `step`.    
```html
2 
4 
6 
8 
10 
```
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Integer [] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; %>
<c:forEach var="number" begin="2" end="10" step="2" varStatus="loopStatus">
${number}
</c:forEach>
</body>
</html>
#### Zadanie 3.

W projekcie stwórz stronę jsp `index3.jsp`. Następnie:
1. W skryptlecie zdefiniuj tablicę jak poniżej:
    ```jsp
    <%!
      String[] names = { "A","B", "C", "D" };
    %>
    ```
2. Za pomocą pętli forEach wyświetl elementy tablicy w formie tabeli html.

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String [] names = { "A","B", "C", "D" }; %>
<table>
<tr>
<c:forEach var="name" items="<%=names%>">
<td style="border: solid 1px"> ${name} </td> 
</c:forEach>
</tr>
</table>
</body>
</html>

#### Zadanie 4.

W projekcie stwórz stronę jsp `index4.jsp`. Następnie:
1. Za pomocą tagów formatujących jstl wyświetl aktualną datę w następującym formacie: `2017-03-13`.
2. Za pomocą tagów formatujących wyświetl wartość `99.14115` w następujące sposoby:
    ```html
    99.141
    99.14115
    9,914%
    99.141 zł
    ```

Hint: Do ustawienia wartości użyj tagu:
```html
<c:set var="Amount" value="99.14115" />  
```
<%@ page import = "java.time.LocalDate"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! LocalDate today = LocalDate.now(); %>
<fmt:formatDate value="${date}" var="formattedDate" 
                type="date" pattern="yyyy-MM-dd" />
${formattedDate}
<fmt:setLocale value="en_US" scope="page"/>
<% double Amount=99.14115; pageContext.setAttribute("Amount", Amount); %>
<fmt:formatNumber pattern="00.000" value="<%=Amount %>" /> <br />
<fmt:formatNumber pattern="00.00000" value="<%=Amount %>" /> <br />
<fmt:formatNumber pattern=".000%" value="<%=Amount/1000 %>" /> <br />
<fmt:formatNumber pattern="00.000zł" value="<%=Amount %>" /> <br />

</body>
</html>
#### Zadanie 5.

W projekcie stwórz stronę jsp `index5.jsp`. Następnie:
1. Za pomocą odpowiedniej funkcji jstl sprawdź czy ustawiony za pomocą poniższego tagu ciąg znaków zawiera napis `coderslab`:
    ```html
    <c:set var="someName" value="Witaj w coderslab."/>  
    ```
2. Jeżeli napis zawiera `coderslab` w instrukcji sterującej wypisz na stronie `<p>OK</p>`
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="substring" value="coderslab"/>
 <c:set var="someName" value="Witaj w coderslab."/> 
 <c:if test = "${fn:contains(someName, substring)}">
        <p>OK</p>
 </c:if>
</body>
</html>.
