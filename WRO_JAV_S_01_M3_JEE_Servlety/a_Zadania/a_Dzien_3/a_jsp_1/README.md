<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java Servlety - jsp

### Zadania.

Stwórz projekt `JSP1`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz stronę `jsp1.jsp`. Następnie: 
1. W skryptlecie utwórz zmienną z aktualną datą i godziną i wyświetl ją na stronie.
2. Pamiętaj by dodać odpowiedni import.

<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
java.util.Calendar today = new java.util.GregorianCalendar();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>To jest HTML</h1>
<%
int counter = 10;
for (int i=0; i<counter; i++){ %>
<p><% out.print(i); %></p>
<%}
%>
<%= new java.util.Date() %>
<hr>
<%= today.get(Calendar.HOUR) %>:<%= today.get(Calendar.MINUTE) %>:<%= today.get(Calendar.SECOND) %>
</body>
</html>

#### Zadanie 2 - rozwiązywane z wykładowcą

W pliku `jsp2.jsp`:
1. W deklaracji utwórz zmienną z aktualną datą i godziną i wyświetl ją na stronie.
2. Zaobserwuj różnicę odświeżając stronę kilka razy.
-------------------------------------------------------------------------------

#### Zadanie 3
W projekcie stwórz stronę `jsp3.jsp`. Następnie: 
1. W skryptlecie pobierz z GET wartości `a` i `b` a następnie wyświetl od `a` do `b`,
 umieszczając je w tagach html w następujący sposób:    
    ````html
    <ul>
      <li>1</li>
      <li>2</li>
      <li>3</li>
      ....
    </ul>
    ````
2. Zakładamy że `a` i `b` są wartościami całkowitymi liczbowymi i `a < b`.

#### Zadanie 4
W projekcie stwórz stronę `jsp4.jsp`. Następnie: 
1. W skryptlecie pobierz z GET wartości km oznaczającą ilość kilometrów.
2. Przelicz w skryptlecie ile to mil (mi =km * 0.62137), a następnie wyświetl wartość.

