<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE - Servlety

### Zadania.

Stwórz projekt `Homework_01`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1

W projekcie stwórz servlet `Servlet_01`, dostępny pod adresem **/Servlet_01**,  
Servlet wczyta zawartość pliku oop.txt a następnie wyświetli jego zawartość na stronie. Jest to lista języków programowania które wzorują się na [paradygmacie obiektowym][oop-paradygmat] pobrana z [Wikipedii][oop-wiki].

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		File file = new File("/home/aleksandra/workspace/Homework_01/oop.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNext())
			response.getWriter().append(scan.nextLine()).append("\n");
		scan.close();
}



#### Zadanie 2

W projekcie stwórz servlet `Servlet_02`, oraz stronę HTML `index.html`, 
w której zawarty jest formularz przesyłający imię oraz płeć .
Po uruchomieniu na serwerze i uzupełnieniu formularza w przeglądarce wyświetlą się powitanie:
```` 
 Coders Lab wita Pana <podane imię>.
````
Jeśli wybrana płeć w formularzu to mężczyzna, w przeciwnym razie wyświetli się powitanie:
```` 
 Coders Lab wita Panią <podane imię>.
````
if(request.getParameter("Plec").equals("Kobieta"))
				response.getWriter().append("Coders Lab wita Pania ").append(request.getParameter("Imie"));
		else 
response.getWriter().append("Coders Lab wita Pania ").append(request.getParameter("Imie"));

#### Zadanie 3

W projekcie stwórz servlety `Servlet_03_1`, `Servlet_03_2`, dostępne odpowiednio pod adresami
 **/Servlet_03_1**, **/Servlet_03_2**.  
Dopisz następującą funkcjonalność:
* Na pierwszej stronie (`Servlet_03_1`) wygeneruj linki do strony `Servlet_03_2`, które będą przesyłały metodą GET id szukanego produktu (wygeneruj dla id z zakresu od `0` do `7`).
* Druga strona (`Servlet_03_2`) po odebraniu danych powinna odnaleźć w przygotowanej tablicy produkt (zakładamy że id kolejny element). Poniżej znajduje się przykładowa tablica z produktami:
    ```java
    String products[] = {
        "Asus Transformr;2999.99",
        "iPhone 6';3499.18",
        "Converse Sneakers;125.00",
        "LG OLED55B6P OLED TV;6493.91",
        "Samsung HT-J4100;800.99",
        "Alpine Swiss Dress Belt;99.08",
        "60 Watt LED;1.50",
        "Arduino Nano;3.26",
    };
    ```
* Jeśli produkt znajduje się w tablicy powinna zostać wyświetlona jego nazwa i cena np.`Asus Transformer - 2999.99zł`
* Jeśli wybierzemy produkt z poza zakresu powinien zostać wyświetlony komunikat `Product not found.`

response.getWriter().append("<div><form name=\"loginForm\" method=\"get\" action=\"http://localhost:8080/ProjectHomework/Servlet_03_2\">"+
		"id: <input type=\"text\" name=\"id\"/>"
		+ "<input type=\"submit\" value=\"Send\"/>"
		+ "</input>"
		+ "</form>"
		+ "</div>");
		request.getParameter("id");
}

String	param	=	request.getParameter("id");
		int q = Integer.parseInt(param);
		String products[] = { "Asus Transformr;2999.99", "iPhone 6';3499.18", "Converse Sneakers;125.00", "LG OLED55B6P OLED TV;6493.91", "Samsung HT-J4100;800.99", "Alpine Swiss Dress Belt;99.08", "60 Watt LED;1.50", "Arduino Nano;3.26"};
	if(q>0&&q<products.length){
		response.getWriter().append(products[q]);
	}
	else{
response.getWriter().append("Product not found");}

#### Zadanie 4

W projekcie stwórz servlet `Servlet_04`, oraz stronę HTML `index.html`, w której zawarty jest formularz przesyłający (metodą GET) 4 parametry liczbowe o nazwie `num`. Po przejściu do servletu oblicz ich średnią, sumę oraz iloczyn i zwróć wynik w przeglądarce:

````
Liczby:
  - x1
  - x2
  - x3
  - x4
Średnia:
  - średnia 
Suma:
  - suma 
Iloczyn:
  - iloczyn 
````
PrintWriter out = response.getWriter();
		Integer suma=0;
		Integer srednia=0;
		Integer iloczyn=1;
		Integer req1 = Integer.parseInt(request.getParameter("1"));
		Integer req2 = Integer.parseInt(request.getParameter("2"));
		Integer req3 = Integer.parseInt(request.getParameter("3"));
		Integer req4 = Integer.parseInt(request.getParameter("4"));
		out.append("Liczby:").append("\n");
		out.append(request.getParameter("1")).append("\n");	
		out.append(request.getParameter("2")).append("\n");
		out.append(request.getParameter("3")).append("\n");
		out.append(request.getParameter("4")).append("\n");
		suma =req1+req2+req3+req4;
		iloczyn=req1*req2*req3*req4;
		srednia=suma/4;
		out.append("suma: ").append(suma.toString()).append("\n");
		out.append("srednia: ").append(srednia.toString()).append("\n");
out.append("iloczyn: ").append(iloczyn.toString()).append("\n");

#### Zadanie 5

W projekcie stwórz servlet `Servlet_05`, który wylosuje 10 liczb z zakresu 1-100. Następnie Wyświetl dwie tabelki z tymi liczbami:
1. Pierwsza tabelka powinna wyświetlić wartości w kolejności jakiej zostały wylosowane.
2. Druga tabelka powinna wyświetlać wartości posortowane (od najmniejszej do największej

<!-- Links -->
[oop-paradygmat]:https://pl.wikipedia.org/wiki/Programowanie_obiektowe
[oop-wiki]:https://en.wikipedia.org/wiki/List_of_object-oriented_programming_languages

Integer [] m = new Integer[10];
		Random generator = new Random();
		PrintWriter out = response.getWriter();
		for(int i=0; i<10; i++) {
		   m[i]=generator.nextInt(100)+1;   
		}
		for(Integer i: m) out.append(i.toString()).append(", ");
		out.append("\n");
		Arrays.sort(m);
		for(Integer i: m) out.append(i.toString()).append(", ");
		out.append("\n");
}



