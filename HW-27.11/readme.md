# Создать spring-приложение с контроллером

## Создать для него 5 endpoint (входных точек):

* [get /message] (http://localhost:8080/message) - случайным образом выбирается фраза из двух "мы вам не рады" и "добро пожаловать"
* [get /count] (http://localhost:8080/count) - увеличить счетчик на один (можно завести поле в классе и изменять его)
* [get /info] (http://localhost:8080/info) - показать актуальное значение счетчика (в браузере)
* [get /save-and-reset] (http://localhost:8080/save-and-reset) - записать актуальное значение счетчика в список, обнулить счетчик 
* [get /list] (http://localhost:8080/list) - показать список, в который записывали значения счетчика