package contrato;
 
import java.util.ArrayList;
import java.util.Calendar;
 
import hospede.Hospede;
import servicos.Servico;
 
/**
 * Classe que representa um contrato em um hotel
 * @author akylles
 *
 */
public class Contrato {
 
        private Hospede hospede;   // O hospede ao qual o contrato esta relacionado
        private Calendar dataInicial, dataFinal;   // datas de inicio e fim do contrato.
        private ArrayList<Servico> servicos = new ArrayList<Servico>();   // Conjunto de servicos de uso do hospede
       
        /**
         *
         * @param hospede
         *                      O hospede ao qual o contrato esta relacionado
         * @param dataInicial
         *                      Data de inicio do contrato (o dia em que o hospede se instala num quarto do hotel)
         * @param dataFinal
         *                      Data de fim do contrato (o dia em que o hospede deixa o hotel)
         * @param servicos
         *                      O conjunto de todos os servicos (triviais e adicionais) em uso pelo hospede
         */
        public Contrato(Hospede hospede, Calendar dataInicial, Calendar dataFinal,
                        ArrayList<Servico> servicos) {
                super();
                this.hospede = hospede;
                this.dataInicial = dataInicial;
                this.dataFinal = dataFinal;
                this.servicos = servicos;
        }
       
        // Metodos modificadores
       
        public void setHospede(Hospede hospede) {
                this.hospede = hospede;
        }
        public void setDataInicial(Calendar dataInicial) {
                this.dataInicial = dataInicial;
        }
        public void setDataFinal(Calendar dataFinal) {
                this.dataFinal = dataFinal;
        }
        public void setServicos(ArrayList<Servico> servicos) {
                this.servicos = servicos;
        }
       
        // Metodos acessadores
       
        public Hospede getHospede() {
                return hospede;
        }
        public Calendar getDataInicial() {
                return dataInicial;
        }
        public Calendar getDataFinal() {
                return dataFinal;
        }
        public ArrayList<Servico> getServicos() {
                return servicos;
        }
       
        /**
         * Metodo que adiciona um novo servico ao conjunto de servicos
         * @param servico
         *                      O servico a ser adiciona ao conjunto de servicos
         */
        public void adicionaServico(Servico servico){
                this.servicos.add(servico);
        }
       
        /**
         * Metodo que calcula o valor total do contrato, somando os valores de cada servico no conjunto
         * @return O custo total da estada do cliente no hotel
         */
        public double custoTotal(){
                double somador = 0;
                for (Servico servico : servicos) {
                        somador += servico.custo();
                }
                return somador;
        }
       
       
}// fim da classe