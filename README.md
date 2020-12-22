# Progetto Programmazione ad Oggetti: Health_Bot

<img src="resources/Bot_def.jpg" style="zoom:15%;" />

## INTRODUZIONE

///

![](resources/Funzionamento_BOT.png)






## UTILIZZO CORRETTO E SCOPO DEL PROGETTO

Il progetto è stato sviluppato utilizzando l'applicazione, disponibile anche in modalità web, Telegram. 
Il fine è creare un chat-bot virtuale, cioè un utente Telegram fittizio, che sia in grado di aiutare l'utilizzatore nell'ambito della salute (health) e dell'allenamento (fit), collezionando dati sulle sue misure e statistiche inerenti i suoi miglioramenti nel tempo. 
Per la realizzazione di tale progetto, è stata consultata prima di tutto l'API (interfaccia di programmazione di un'applicazione) ufficiale di Telegram, poi si è attinto dal sito RapidApi, che mette a disposizione utili API gratuite: ne è un esempio quella per il calcolo del BMI. Queste sono utilizzabili da software di API development come Postman: tale programma consente una gestione facilitata del codice della pagina e fornisce i risultati delle nostre richieste in formato JSON.
Il codice, poi, è stato elaborato tramite l’IDE ECLIPSE in linguaggio java.



## GETTING STARTED

Per poter iniziare è necessario creare un bot su Telegram interagendo direttamente con il BotFather, come mostrato in figura:



Successivamente, seguendo le istruzioni indicate da BotFather, sarà possibile, per esempio:

- Scegliere lo username per il bot, che deve terminare per forza con 'Bot' o 'bot';

- Abilitare/disabilitare il bot ad essere inseriro in chat e gruppi;

- Scegliere la descrizione, dopo aver selezionato il bot, con il comando '/setdescription'.

  Inoltre BotFather dà fornisce all'utente il token per accedere all'HTTP API del Bot.



## DIAGRAMMI UML E FUNZIONAMENTO DEL SOFTWARE

Diagramma dei casi d'uso:

![](resources/UML/Health_Bot_UseCaseDiagram.png)



Diagrammi delle classi:

<img src="resources/UML/class_diagram-Diagramma classi.png" style="zoom:80%;" />



Diagrammi delle sequenze:

![](resources/UML/Seq_diagram-Seq_Updates.png)



## Contributors

- Federico Palazzi [https://github.com/fedePalazz]
- Giovanni Novelli [https://github.com/GiovanniNovelli9] 
- Alessio Baldelli [https://github.com/Baldellaux]

