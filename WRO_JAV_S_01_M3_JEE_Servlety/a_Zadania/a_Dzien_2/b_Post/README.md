<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - POST

### Zadania.

Stwórz projekt `Post`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz servlet `Servlet_01`, oraz stronę HTML `index_1.html`, w której zawarty jest formularz przesyłający imię i nazwisko. Po uruchomieniu na serwerze i uzupełnieniu formularza w przeglądarce wyświetlą się napis:
  `Witaj, <podane imię> <podane nazwisko>`.

doGet(request, response);
response.getWriter().append("Witaj, ").append(request.getParameter("firstname")).append(" ").append(request.getParameter("surname"));

#### Zadanie 2 - rozwiązywane z wykładowcą

W projekcie stwórz servlet `Servlet_02`, oraz stronę HTML `index_2.html`. Następnie:
1. Dodaj do strony jest formularz, wysyłany metodą `POST`. Formularz powinien zawierać jedno pole tekstowe i jeden checkbox z opisem `Jestem świadomy konsekwencji`.
3. Dopisz funkcjonalność która po przesłaniu formularza sprawdzi, czy wpisany przez użytkownika tekst zawiera wulgaryzmy. Jeżeli tak, to nasz kod powinien zastąpić wulgarne słowo znakami. `****`

Na przykład frazę `cholera, znowu ta JAVA ` powinien zastąpić frazą `*******, znów ta JAVA `.
Jeżeli użytkownik zaznaczy checkbox `Jestem świadomy konsekwencji`, to program nie sprawdzi wulgaryzmów i wyświetli wpisany tekst.
Liczba gwiazdek ma odpowiadać liczbie znaków w cenzurowanym słowie.

PrintWriter out = response.getWriter();
		String str = request.getParameter("string");
		String check = request.getParameter("check");
		if(check!=null) {
			out.append(str);
		}
		else {
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			String token=st.nextToken();
			for(String wyrazy: lista.wulgaryzmy)
				if(token.equals(wyrazy)) 
					token="****";
			out.append(token).append(" ");
		}
		}
		}
}

Hint: listę wulgaryzmów możesz stworzyć samodzielnie w postaci tablicy, lub poszukać gotowych tablic w internecie.

-------------------------------------------------------------------------------
#### Zadanie 3

W projekcie stwórz servlet  `Servlet_03`, oraz stronę HTML `index_3.html`. Następnie:
1. Napisz formularz, zawierający trzy pola liczbowe: a, b i c. 
2. Dopisz funkcjonalność która po przesłaniu formularza wyliczy miejsca zerowe funkcji kwadratowej zdefiniowanej poprzez podane w formularzu liczby `(ax^2+bx+c)`. Wyświetl wyliczone miejsca zerowe na stronie.
W przypadku `delta<0` servlet wyświetli odpowiedni komunikat.

Double a = Double.parseDouble(request.getParameter("a"));
		Double b = Double.parseDouble(request.getParameter("b"));
		Double c = Double.parseDouble(request.getParameter("c"));
		Double delta=b*b-4*a*c;
		if(delta==0) {
			Double x=-b/(2*a); 
			response.getWriter().append("Miejsca zerowe: ").append(x.toString()).append(", ");
		}
		else if(delta>0) {
			Double x1 = (-b-Math.sqrt(delta)/(2*a));
			Double x2 = (-b+Math.sqrt(delta)/(2*a));
			response.getWriter().append("Miejsca zerowe: ").append(x1.toString()).append(", ").append(x2.toString());
		}
		if(delta<0) {
			response.getWriter().append("Nie ma miejsc zerowych");
		}
}
#### Zadanie 4

W projekcie stwórz servlet `Servlet_04`. Następnie:
1. w metodzie `doGet`, będzie wyświetlał formularz z losową ilością parametrów (w zakresie od 5 do 10) o takiej samej nazwie `numbers`.
2. W metodzie `doPost` pobierz wszystkie parametry - te z nich, które reprezentują wartość liczbową, wyświetl posortowane od najmniejszego do największego.

Skorzystaj z poniższego formularza:
```html
<form action='' method='post'>
<input name='numbers'/><br/>
<input name='numbers'/><br/>
<input name='numbers'/><br/>
<input name='numbers'/><br/>

<!-- parametrów może być więcej  -->

<input type='submit'/>
</form>
``` 
rotected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Random generator = new Random();
		PrintWriter out = response.getWriter();
		Integer ile = generator.nextInt(5)+5; 
		out.append("<div><form action=\"http://localhost:8080/Servlets_2/Servlet_2b_04\" method=\"post\">");
		for(Integer i=0; i<ile; i++)
		response.getWriter().append("<input type=\"number\" name=\"number\">");	
		out.append("<input type=\"submit\" name=\"submit\"> </form> </div>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String [] tab = request.getParameterValues("number");
		System.out.println(tab);
		Integer [] tabInt = new Integer [tab.length];
		int pos=0;
		for(String subtab : tab) {
			tabInt[pos]=Integer.parseInt(subtab);
			pos++;
		}
		Arrays.sort(tabInt);
		for(Integer i: tabInt)
		response.getWriter().append(i.toString()).append(" ");	
	}

}

#### Zadanie 5

W projekcie stwórz servlet  `Servlet_05`, oraz stronę HTML `index_4.html`. Następnie:
1. Do strony dodaj formularz zawierający jedno pole liczbowe, oraz dwa przyciski `submit`. Każdy z przycisków niech ma inny atrybut `name` mówiący o sposobie konwersji. 
3. Po wysłaniu odpowiednich danych servlet ma przeliczać temperaturę w stopniach Celsjusza na temperaturę w stopniach Fahrenheita (i w drugą stronę). Który przycisk został kliknięty przez użytkownika dowiesz się po wartości pola `convertionType` przesyłanego POST-em.

Skorzystaj z poniższego formularza:
```html
<form action="" method="POST">
    <label>
        Temperatura:
        <input type="number" min="0.00" step="0.01" name="degrees">
    </label>
    <input type="submit" name="convertionType" value="celcToFahr">
    <input type="submit" name="convertionType" value="FahrToCelc">
</form>
``` 
* Ab

PrintWriter out = response.getWriter();
		if (request.getParameter("convertionType").equals("celcToFahr")) {
			
			Double.parseDouble(request.getParameter("degrees"));
			
			out.append(" ");	
		}
		else if (request.getParameter("convertionType").equals("FahrToCelc"))		
			Double.parseDouble(request.getParameter("degrees"));





y przeliczyć jednostki użyj wzorów znajdujących się [tutaj][degrees-convertion].

[degrees-convertion]:https://pl.wikipedia.org/wiki/Skala_Fahrenheita#Spos.C3.B3b_dok.C5.82adny
[nbp]:http://www.nbp.pl/home.aspx?navid=archa&c=/ascx/tabarch.ascx&n=a008z170112
[binary-convertion]:http://www.wikihow.com/Convert-from-Binary-to-Decimal
