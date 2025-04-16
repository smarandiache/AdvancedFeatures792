package org.example.part2_oop_principles.encapsulation;

/*
    Definitie: Incapsularea inseamna ascunderea detaliilor interne ale unui obiect si oferirea unor metode
    publice prin care utilizatorii pot interactiona cu datele clasei intr-un mod controlat.

    Dependinta ajutatoare: Lambak - putem sa cream la nivel de  anotatie, structuri de cod nealterate/standard,
    de form getters/setters, constructori neparametrizat/parametrizat, metode suprascrise
 */

public class UserAccount {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username != null && username.length() >=5){
            this.username = username;
        } else {
            throw new IllegalArgumentException("Username-ul ar trebui sa aiba cel putin 5 caractere!");
        }
    }

    // folosit pt verificare in server! nu se foloseste in aplicatie reala pt ca user-ul & parola nu trebuie sa apara
    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setPassword(String password) {
        // parolaA123 - sunt parole ok
        // parola123, xyz - nu sunt parole ok
        // .*[A-Z].* - verifica ca avem litere mari in structura stringului
        if(password.matches(".*[A-Z].*") && password.length() >= 8){
            this.password = password;
        } else {
            throw new IllegalArgumentException("Parola este prea slaba!");
        }
    }
}
