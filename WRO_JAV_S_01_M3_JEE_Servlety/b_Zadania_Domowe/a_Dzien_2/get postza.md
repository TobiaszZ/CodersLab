<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE - Servlety

### Zadania.

1. Stwórz projekt `Homework_02`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1

1. W projekcie stwórz servlet `Servlet_01`, oraz stronę HTML `index.html`,
w której zawarty jest formularz, który zawiera jedno pole liczbowe oraz pola typu `radio`. 
Po przesłaniu formularza Servlet przelicza waluty:  
    * `EUR → USD`
    * `USD → EUR`
    * `EUR → PLN`
    * `PLN → EUR`
    * `USD → PLN`
    * `PLN → USD`
  
Przeliczona kwota pokazuje się jako wynik w przeglądarce.  
Hint: Kursy walut możesz przygotować jako tablicę (kursy mogą być przez Ciebie wymyślone lub możesz je na stronie [NBP][nbp]).

PrintWriter out = response.getWriter();
		Double kwota = Double.parseDouble(request.getParameter("kwota"));
		switch(request.getParameter("waluta")) {
		case "EurUsd": {
			kwota*=(1.16);
		}
		case "UsdEur": {
			kwota*=(0.86);
		}	
		case "EurPln":	{
			kwota*=(4.25);
		}
		case "PlnEur": {
			kwota*=(0.23);
		}
		case "UsdPln": {
			kwota*=(3.66);
		}
		case "PlnUsd": {
			kwota*=(0.27);
		}
out.append("Kwota po przeliczeniu: " + kwota);

#### Zadanie 2

W projekcie stwórz servlet `Servlet_02`, oraz stronę HTML `index.html`, w której zawarty jest formularz, zawierający jedno pole liczbowe. Po przesłaniu formularza Servlet przelicza wpisaną do formularza wartość binarną liczby na wartość dziesiętną.  
Servlet musi wykonać następujące kroki:  
  * Sprawdzić czy przekazany ciąg zawiera **tylko** `0` i `1`, jeśli nie, wyświetlić stosowny komunikat
  * Podzielić ciąg na pojedyncze znaki
  * Idąc od końca ciągu mnożyć kolejne liczby przez kolejne potęgi liczby `2`  
    * `Ostatnia liczba` x `2^0`
    * `Przedostatnia liczba` x `2^1`
    * itd.
  * Po dokonaniu obliczenia wyświetl na stronie komunikat np. `1001 to liczba 9`.

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
	String liczba = request.getParameter("binary");
	for(int i=0; i<liczba.length(); i++ )
		if(liczba.charAt(i)!='0' && liczba.charAt(i)!='1') {
			out.append("Błędna liczba!"); 
			break;
			}
	Integer i = Integer.parseInt(liczba,2);
	out.append("Integer value: "+i);
	}


Hint: Jeżeli nie rozumiesz jak przeliczyć liczbę zapisaną w systemie binarnym na system dziesiętny to zajrzyj [tutaj][binary-convertion].


#### Zadanie 3
W projekcie stwórz servlet `Servlet_03`. Ma on implementować następujące funkcjonalności:
1. Po wejściu na stronę metodą GET (czyli w metodzie `doGet`), wygeneruj formularz formularz z `5` polami tekstowymi `input`. Formularz ma przesyłać dane z użyciem `POST` do adresu z servletu.
2. Po otrzymaniu danych z formularza, zapisz pobrane dane zapisz w sesji.
3. Do metody `doGet` dopisz funkcjonalność sprawdzającą czy w sesji istnieją dane z poprzedniego punktu. Jeżeli dane istnieją  wypełnij nimi pola `input` formularza.
PrintWriter out = response.getWriter();
		HttpSession	sess = request.getSession();
		
		if	(sess.isNew()) {
		out.append("<div><FORM METHOD='post'><div>"
				+ "<input type='text' name='jeden'>"
				+ "<input type='text' name='dwa'>"
				+ "<input type='text' name='trzy'>"
				+ "<input type='text' name='cztery'>"
				+ "<input type='text' name='piec'>"
				+ "<input type='submit' value='submit'>"
				+ "</div></form></div>");
		}
		else {
			out.append("<div><FORM METHOD='post'><div>"
					+ "<input type='text' name='jeden' value="+ sess.getAttribute("jeden") + ">"
					+ "<input type='text' name='dwa' value="+ sess.getAttribute("dwa") + ">"
					+ "<input type='text' name='trzy' value="+ sess.getAttribute("trzy") + ">" 
					+ "<input type='text' name='cztery' value="+ sess.getAttribute("cztery") + ">"
					+ "<input type='text' name='piec' value="+ sess.getAttribute("piec") + ">"
					+ "<input type='submit' value='submit'>"
					+ "</div></form></div>");
			}
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		sess.setAttribute("jeden",request.getParameter("jeden"));
		sess.setAttribute("dwa",request.getParameter("dwa"));
		sess.setAttribute("trzy",request.getParameter("trzy"));
		sess.setAttribute("cztery",request.getParameter("cztery"));
		sess.setAttribute("piec",request.getParameter("piec"));
doGet(request, response);
#### Zadanie 4
W projekcie stwórz servlet `Servlet_04`. Celem zadania jest wyświetlanie ilości wizyt na stronie. W servlecie:
1. Sprawdź czy użytkownik posiada zapisane ciasteczko o nazwie `visits`:
    * jeśli nie wyświetl komunikat: `Witaj pierwszy raz na naszej stronie`, oraz dodaj ciasteczko o nazwie `visit`s zapisując mu wartość 1 i czas ważności 1 rok.
    * jeśli ciasteczko jest zapisane, pobierz jego aktualną wartość i wypisz na stronie komunikat `Witaj, odwiedziłeś nas już X razy`. Zwiększ też wartość ciasteczka o 1.
response.getWriter().append("Served at: ").append(request.getContextPath()).append("\n");
                final String cookieName = "visited";
                Cookie[] cookies = request.getCookies();
                int counter = 1;
                Cookie ourCookie = null;         
                if(cookies!=null) {
                for(Cookie cookie: cookies) {
                        if(cookieName.equals(cookie.getName())) {
                                try {
                                        counter = Integer.parseInt(cookie.getValue());
                                        counter++;
                                        response.getWriter().append("Ojej, juz jesteś "+ counter + " raz, nuuuda!");
                                        ourCookie = cookie;
                                        ourCookie.setValue(Integer.toString(counter));
                                }catch(Exception e) {
                                        System.out.println(e);
                                }finally{
                                        break;
                                }
                        }
                }
                }
                if(ourCookie == null) {
                        response.getWriter().append("Witaj!!!!!");
                        ourCookie = new Cookie(
                                        cookieName, 
                                        Integer.toString(counter)
                                        );
                }
                ourCookie.setMaxAge(60*60*24*365);
                response.addCookie(ourCookie);                      
        }
}

#### Zadanie 5
W projekcie stwórz servlet `Servlet_05_1` oraz `Servlet_05_2`. Celem zadania jest przechowywanie koszyka zakupowego.
1. Stwórz formularz, z polem tekstowym (nazwa) oraz dwoma numerycznymi (ilość i cena), służącymi do dodawania produktu do koszyka. Formularz powinien być przesłany na tą samą stronę metodą `POST`. 
2. Po przesłaniu danych metodą POST przesłany produkt wraz z ceną i ilością dodaj do sesji pod kluczem `basket`. Pamiętaj, iż klucz `basket` w sesji musi przechowywać więcej niż `1` produkt (użyj tablicy). Po dodaniu elementu do koszyka wyświetl komunikat `Produkt dodany` i formularz służący do dodanie następnego produktu (taki sam jak w punkcie 1).
3. Na stronie formularza dodaj odnośnik do strony wyświetlającej zawartość koszyka.
4. W servlecie `Servlet_05_2` wyświetl zawartość koszyka oraz sumę cen produktów, pamiętaj iż każdy produkt ma dodaną ilość.

Przykład - strona koszyka:
```
Produkt 1 - 4 x 5.20zł = 20.80zł
Produkt 2 - 1 x 9.99zł =  9.99zł
Produkt 3 - 1 x 2.20zł =  2.20zł
                   SUMA: 32.99zł
```


<!-- Links -->
[degrees-convertion]:https://pl.wikipedia.org/wiki/Skala_Fahrenheita#Spos.C3.B3b_dok.C5.82adny
[submit-btns]:http://stackoverflow.com/a/2680198
[nbp]:http://www.nbp.pl/home.aspx?navid=archa&c=/ascx/tabarch.ascx&n=a008z170112
[binary-convertion]:http://www.wikihow.com/Convert-from-Binary-to-Decimal
