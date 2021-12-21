package com.company.DTB31OutstaffWorkers;

public class ClientContactsTABLE {
    private String clientCompany = "";
    private String contactsClient = "";
    private String adressCompany = "";

public ClientContactsTABLE(){
}

    public String getClientCompany(){
    return clientCompany;
    }

    public void setClientCompany(String clientCompany) {
        this.clientCompany = clientCompany;
    }

    public String getContactsClient() {
    return contactsClient;
    }

    public void setContactsClient(String contactsClient) {
        this.contactsClient = contactsClient;
    }

    public String getAdressCompany(){
    return adressCompany;
    }

    public void setAdressCompany(String adressCompany) {
        this.adressCompany = adressCompany;
    }

}

/* здесь я хотел создать конструктор класса с пустыми полями
потом стала проблема с назначением геттеров и сеттеров на поля класса, но IDE мне предложила
заменить синтаксис введением конструкции this
я толком не понимаю как оно работает, но подозреваю что при создании полей метод будет
назначать вводимые переменные полям.
то есть я хотел создать класс с пустым конструктором и пустыми же геттерами и сеттерами.

и еще - IDEA говорит что осталось 3 дня - мне не переживать и потом просто ее снести и поставить
снова и потом подгрузить классы? не будет проблем с настройкой?

 */