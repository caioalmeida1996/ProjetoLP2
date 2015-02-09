package hospede;

import java.util.Calendar;
 
/**
 * Classe que representa uma pessoa que se hospeda no hotel
 * @author akylles
 *
 */
public class Hospede {
 
        private String nome, cpf, endereco;
        private int numeroDoCartao;
        private  Calendar dataDeNacimento;
 
        /**
         * 
         * @param nome
         * 			(String) A representacao do nome do hospede.
         * @param cpf
         * 			(String) A representacao do CPF do hospede.
         * @param dataDeNacimento
         * 			(String) A representacao da data de nascimento do hospede.
         * @param endereco
         * 			(String) A representacao do endereco do hospede.
         * @param NumeroDocartao
         * 			(String) A representacao do numero do cartao do hospede.
         */
        public Hospede(String nome, String cpf,Calendar dataDeNacimento, String endereco, int NumeroDocartao) {
                super();
                this.nome = nome;
                this.cpf = cpf;
                this.dataDeNacimento = dataDeNacimento;
                this.endereco = endereco;
                this.dataDeNacimento = dataDeNacimento;
                this.numeroDoCartao = numeroDoCartao;
        }
 
        /**
         * 
         * @return
         * 		O numero do cartão do hospede.
         */
        public int getNumeroDoCartao() {
			return numeroDoCartao;
		}
        
        /**
         * 
         * @return
         * 		a data de nascimento;
         */

		public Calendar getDataDeNacimento() {
			return dataDeNacimento;
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