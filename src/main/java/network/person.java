package network;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public class person {
    String name;
    int age;
    char gender;


    public void createPerson() {
        Scanner input = new Scanner(System.in);

        int count = 0;

        do {
            System.out.println("Could you write person name ? ");
            person.this.setName(input.nextLine());
            count += 1;
            System.out.println("Could you write person age ? ");
            person.this.setAge(input.nextInt());
            count += 1;
        } while (count < 2);


    }


}
