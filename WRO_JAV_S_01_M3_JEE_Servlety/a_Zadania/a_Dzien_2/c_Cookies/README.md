<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - COOKIE

### Zadania.

Stwórz projekt `Cookie`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz trzy servlety `Servlet_01_Set`, `Servlet_01_Get`, `Servlet_01_Del`. Następnie:
1. Servlet `Servlet_01_Set ma być dostępny pod adresem `/setCookie`. Ma nastawiać ciasteczko o nazwie ```User``` na `Coders Lab`, z ważnością `24h`.
2. Servlet `Servlet_01_Get` ma być dostępny pod adresem `/showCookie`. Ma wyświetlać zawartość ciasteczka ```User```. Jeżeli nie ma takiego ciasteczka, to powinna się  wyświetlić odpowiednia informacje.
3. Servlet `Servlet_01_Del` ma być dostępny pod adresem  `/deleteCookie` ma kasować ciasteczko o nazwie ```User```. Jeżeli nie ma takiego ciasteczka, to powinna się  wyświetlić odpowiednia informacje.
  
  
PrintWriter out = response.getWriter();
		out.append("<div><form method='post'><input type='number' name='ocena' placeholder='wpisz ocene 1-6'><input type='submit' value='Wyslij'></form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		List<Integer> scoreArray;
		if(sess.isNew()) {
			scoreArray = new ArrayList<>();
		}
		else {
			scoreArray = (List<Integer>) sess.getAttribute("scoreArray"); 
		}
		String raw_score = request.getParameter("ocena");
		try {
			int score = Integer.parseInt(raw_score);
			if(score>0 && score<7) {
				scoreArray.add(score);
			}
		} catch (Exception e) {
			System.out.println("zła ocena" + raw_score);
		}
	}

  
#### Zadanie 2 - rozwiązywane z wykładowcą.
W projekcie stwórz servlet `Servlet_08`, dostępny pod adresem `/addToCookie`, który wyświetli następujący formularz:  
```html
<form action="" method="POST">
    <label>
        Klucz:
        <input type="text" name="key">
    </label>
    <label>
        Wartość:
        <input type="text" name="value">
    </label>
    <input type="submit">

</form>
  ``` 
Po zatwierdzeniu formularza metodą POST dodajemy nowe ciasteczko o podanej nazwie i wartości.    
response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie cookie = new Cookie("user", "CodersLab");
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
		PrintWriter out = response.getWriter();
		Cookie [] cookies = request.getCookies();
		String result = "Nie ma ciasteczka";
		for(Cookie c: cookies) {
			if ("user".equals(c.getName())) { 
				result = c.getValue();
				break;
			}
		}
		response.getWriter().append("<div> Served at: ").append(request.getContextPath()).append("<h1>").append(result).append("</h1>").append("</div>");	
		}


-------------------------------------------------------------------------------

#### Zadanie 3 

W projekcie stwórz servlet `Servlet_03`, oraz stronę HTML `index_3.html`, strona ma zawierać formularz z polami jak w zadaniu 2, oraz dodatkowym polem `select`, z wartościami od 1 - 10.
Po zatwierdzeniu formularza zostanie dodane ciasteczko o podanej nazwie, wartości i czasem życia w godzinach pobranym z pola formularza typu `select`. 

Hint: Żeby sprawdzić czy ciasteczko jest poprawnie zapisane przejdź do konsoli deweloperskiej Twojej przeglądarki (`ctrl + shift + i`), 
następnie do zakładki `Application` i wybierz Cookies z tabelki po prawej stronie. Powinny Ci się wtedy wyświetlić wszystkie ciasteczka jakie są trzymane w Twojej przeglądarce. 

Cookie cookie = new Cookie(request.getParameter("key"), request.getParameter("value"));
		cookie.setMaxAge(Integer.parseInt(request.getParameter("select")));
response.addCookie(cookie);
#### Zadanie 4

W projekcie stwórz servlet `Servlet_04_Show` i `Servlet_04_Del`. Następnie:
1. W servlecie `Servlet_04_Show` wyświetl wszystkie ciasteczka. 
2. Przy każdym z nich wygeneruje link do drugiego servletu `Servlet_04_Del`. Pamiętaj o przekazaniu w danych GET nazwy tego ciasteczka. 
3. W servlecie `Servlet_04_Del` usuń ciasteczko i poinformuje o tym. 

#### Zadanie 5

W projekcie stwórz dwa servlety `Servlet_05_1` i `Servlet_05_2`. Następnie:
1. Wymagamy aby użytkownik najpierw odwiedził stronę wygenerowaną przez servlet `Servlet_05_1`, a dopiero potem mógł przejść do strony wygenerowanej przez `Servlet_05_2`.
2. Gdy użytkownik wejdzie na pierwszą stronę zapisz odpowiednią informację w ciasteczku oraz wygeneruj link do drugiego servletu.
3. Przy wejściu na stronę wygenerowaną przez servlet `Servlet_05_2` sprawdź czy dane ciasteczko istnieje:
    * Jeżeli istnieje to je usuń oraz wypisz komunikat `Witamy na stronie Servlet_05_2`
    * jeżeli ciasteczka nie ma to przekieruj przekieruj na adres servletu `Servlet_05_1` z adnotacją `Nie odwiedziłeś jeszcze tej strony`.

Hint: Przetestuj servlety w różnych przeglądarkach, manualnie usuwając ciasteczka (możesz to zrobić w konsoli deweloperskiej).

#### Zadanie 6
W projekcie stwórz servlet `Servlet_06`, oraz stronę HTML `index_6.html`. Następnie:
1. Do strony dodaj formularz umożliwiający wybór koloru tekstu i tła wyświetlanego na odwiedzanym servlecie.
2. Po przesłaniu metodą POST kolorów użytkownik zostanie przekierowany do servletu który zapamięta wybrane kolory w ciasteczkach. Servlet powinien również wyświetlić prosty tekst w wybranym kolorze na wybranym tle:
    ````
    Wybrałeś kolor tekstu jako: <wybrany_kolor_1>, oraz tła jako: <wybrany_kolor_2>. Twój wybór został zapisane w ciasteczku.
    ````
3. Do servletu dodaj funkcjonalność która sprawdzi czy istnieją odpowiednie ciasteczka. Jeżeli istnieją to servlet powinien wyświetlić tekst:
    ````
    Zapamiętany w ciasteczku kolor tekstu to: <wybrany_kolor_1>, oraz tła jako: <wybrany_kolor_2>.
    ````
    Ta funkcjonalność powinna działać **tylko** w przypadku kiedy dane POST nie zostały wysłane.
4. Do servletu dopisz kod sprawdzający czy kolory zostały wybrane przez użytkownika (czyli przesłane POST-em) lub istnieją w ciasteczku. Jeżeli kolory nie zostały wybrane i nie ma odpowiedniego ciasteczka to przekieruj użytkownika do strony wyboru.  

#### Zadanie 7
W projekcie stwórz servlet `Servlet_07`, dostępny pod adresem `/rememberMe`. Następnie:
1. W servlecie utwórz formularz, zawierający pole `name` oraz checkbox z labelem `Zapamiętaj mnie`.
 Formularz powinien przesyłać dane metodą POST na ten sam adres.
2. Dopisz obsługę metody POST w servlecie. Sevlet powinien wyświetlić komunikat `Cześć {imię przesłane w formularzu}`.
 W przypadku zaznaczenia checkboxa, imię użytkownika zapamiętaj w ciasteczku.
3. Dodaj funkcjonalność która w przypadku wejścia na stronę metodą GET sprawdzi czy istnieje odpowiednie ciasteczko.
 Jeżeli tak to nie wyświetlaj formularza do logowania tylko wyświetl komunikat `Cześć {imię przesłane w formularzu}. Twoje dane zostały wczytane z ciasteczka`
