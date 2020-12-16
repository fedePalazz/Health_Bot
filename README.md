# Progetto Programmazione ad Oggetti: Health_Bot

## UTILIZZO CORRETTO E SCOPO DEL PROGETTO

Il progetto è stato sviluppato utilizzando l'applicazione, disponibile anche in modalità web, Telegram. 
Il fine è creare un chat-bot virtuale, cioè un utente Telegram fittizio, che sia in grado di aiutare l'utilizzatore nell'ambito della salute (health) e dell'allenamento (fit), collezionando dati sulle sue misure e statistiche inerenti i suoi miglioramenti nel tempo. 
Per la realizzazione di tale progetto, è stata consultata prima di tutto l'API (interfaccia di programmazione di un'applicazione) ufficiale di Telegram, poi si è attinto dal sito RapidApi, che mette a disposizione utili API gratuite: ne è un esempio quella per il calcolo del BMI. Queste sono utilizzabili da software di API development come Postman: tale programma consente una gestione facilitata del codice della pagina e fornisce i risultati delle nostre richieste in formato JSON.
Il codice, poi, è stato elaborato tramite l’IDE ECLIPSE in linguaggio java. Con l’utilizzo della Web Application Spring Boot è possibile lanciare il programma, sviluppato in ambiente Eclipse, attraverso Postman ed effettuare le seguenti richieste di GET e POST:

- Elencarle

-

-

## INIZIALIZZARE IL PROGRAMMA

Per poter iniziare è necessario creare un bot su Telegram interagendo direttamente con il BotFather, come mostrato in figura:

![Schermata 2020-12-14 alle 14.27.21](/Users/baldellaux/Desktop/BOT_Project/Schermata 2020-12-14 alle 14.27.21.png)

Successivamente, seguendo le istruzioni indicate da BotFather, sarà possibile, per esempio:

- Scegliere lo username per il bot, che deve terminare per forza con 'Bot' o 'bot';

- Abilitare/disabilitare il bot ad essere inseriro in chat e gruppi;

- Scegliere la descrizione, dopo aver selezionato il bot, con il comando '/setdescription'.

  Inoltre BotFather dà fornisce all'utente il token per accedere all'HTTP API del Bot.

## DIAGRAMMI UML E FUNZIONAMENTO DEL SOFTWARE

Diagramma dei casi d'uso:

![Health_Bot__Case Diagram](/Users/baldellaux/Desktop/BOT_Project/UML/Health_Bot/Health_Bot__Case Diagram.jpg)



## Contributors

- Federico Palazzi [https://github.com/]
- Giovanni Novelli [https://github.com/] 
- Alessio Baldelli [https://github.com/Baldellaux]

