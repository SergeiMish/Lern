package ru.yandex.practicum;

// Дополните класс для проверки суммы ипотеки пользователя
public class ContactBook <T,V> {
        // Объявите поле класса contacts - список контактов книги
        ...

public void addContact(... contact) {
        contacts.add(contact);
        }

public void printList() {
        // Выведите на экран весь список контактов книги
        ...
        System.out.println("Имя: " + contact.getName());
        contact.print();
        }

public void congratulate(String name) {
        boolean contactPresented = false; //проверяем есть ли контакт в базе
        // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        ...
        System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
        contact.sendMessage();

        // Если контакт не найден, выведите соответствующее сообщение
        System.out.println("Не найден контакт с указанным именем.");
        }

        }