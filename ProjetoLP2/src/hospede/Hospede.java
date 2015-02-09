package hospede;
 
/**
 * Classe que representa uma pessoa que se hospeda no hotel
 * @author akylles
 *
 */
public class Hospede {
 
        private String nome, cpf, endereco;
 
        /**
         *
         * @param nome
         *                      (String) A representacao do nome do hospede
         * @param cpf
         *                      (String) A representacao do CPF do hospede
         * @param endereco
         *                      (String) A representacao do endereco do hospede
         */
        public Hospede(String nome, String cpf, String endereco) {
                super();
                this.nome = nome;
                this.cpf = cpf;
                this.endereco = endereco;
        }
 
        /**
         * Recupera o nome do hospede
         * @return o nome do hospede
         */
        public String getNome() {
                return nome;
        }
 
        /**
         * Recupera o CPF do hospede
         * @return o CPF do hospede
         */
        public String getCpf() {
                return cpf;
        }
 
        /**
         * Recupera o endereco do hospede
         * @return o endereco do hospede
         */
        public String getEndereco() {
                return endereco;
        }
       
}// fim da classe