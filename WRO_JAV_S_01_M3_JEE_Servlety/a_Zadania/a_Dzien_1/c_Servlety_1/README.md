<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - Servlety

### Zadania.

1. Stwórz projekt `Servlety_01`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

1. Stwórz projekt a w nim servlet `Servlet_01`, dostępny pod adresem **/Servlet_01**,
który wyświetli na konsoli "Hello First Servlet".

3. Skonfiguruj Eclipse wraz z serwerem Tomcat.
4. Uruchom projekt.

#### Zadanie 2 - rozwiązywane z wykładowcą

1. W projekcie stwórz servlet `Servlet_02`, dostępny pod adresem **/Servlet_02**, 
który wyświetli w przeglądarce "Wynik servletu w przeglądarce".
2. Jednocześnie w konsoli wyświetli "Komunikat na konsoli". 
3. Adres strony powinien być określony za pomocą adnotacji.

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("Wynik servletu w przeglądarce");
		System.out.println("Komunikat na konsoli");
}

-------------------------------------------------------------------------------

#### Zadanie 3

1. W projekcie stwórz servlet `Servlet_03`, dostępny pod adresem **/Servlet_03**,
który wyświetli w przeglądarce "Zadanie 3".
2. Jednocześnie w konsoli wyświetli "Komunikat na konsoli". 
3. Adres strony powinien być określony za pomocą odpowiedniego wpisu w deskryptorze wdrożenia.


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Zadanie 3");
System.out.println("Komunikat na konsoli"); 

#### Zadanie 4

1. W projekcie stwórz servlet `Servlet_04`, dostępny pod adresem **/Servlet_04**,
który wyświetli w konsoli "Zadanie 4".
2. Komunikat na konsoli powinien zostać wyświetlony tylko raz, niezależnie od ilości odświeżeń strony.

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		while(something==true) { 
		System.out.println(something);
		something=false;
		}
}

#### Zadanie 5

1. W projekcie stwórz servlet `Servlet_05`, dostępny pod adresem **/Servlet_05**,
który wyświetli wszystkie informacje z nagłówka w formacie: `nazwaNagłówka : wartość`.


