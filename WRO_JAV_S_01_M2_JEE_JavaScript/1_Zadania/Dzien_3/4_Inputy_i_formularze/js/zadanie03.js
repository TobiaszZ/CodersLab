DOMContentLoaded	jest	specjalnym
eventem,	uruchamiającym	się	w
momencie	załadowania	całej	strony.
Nasz	cały	kod	JavaScript	operujący	na
DOM	powinien	znajdować	się	w	tym
evencie.	Inaczej	nie	mamy	gwarancji,
że	element	którego	szukamy,	został	już
stworzony!
Jeżeli	wykonujesz	operacje	na	DOM,
upewnij	się,	że	cały	dokument	został
uprzednio	załadowany!
