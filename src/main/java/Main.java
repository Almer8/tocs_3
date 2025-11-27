public class Main {

    public static void main(String[] args) {

        MyHashTable myHashTable = new MyHashTable();
        myHashTable.put("Бугрименко",1);
        myHashTable.put("Гінайло",2);
        myHashTable.put("Голубєв",3);
        myHashTable.put("Горбенко",4);
        myHashTable.put("Гуржи",5);
        myHashTable.put("Кравченко",6);
        myHashTable.put("Ловягін",7);
        myHashTable.put("Мартов",8);
        myHashTable.put("Пітонов",9);
        myHashTable.put("Сюсько",10);
        myHashTable.put("Теплюк",11);
        myHashTable.put("Фурсов",12);
        myHashTable.put("Чістяков",13);

        myHashTable.get("Теплюк");
        myHashTable.get("Шергін");

    }
}
