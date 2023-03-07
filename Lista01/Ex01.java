public class Pessoa {
    
    String nome;
    String sexo;
    String dataDeNascimento;
    String estadoCivil = "solteiro";



    public Pessoa(String nome, String sexo, String dataDeNascimento) {

        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }

        public String getNome() {
            return this.nome;
        }
    
        public String getSexo() {
            return this.sexo;
        }
    
        public String getDataNascimento() {
            return this.dataDeNascimento;
        }
    
        public String getEstadoCivil() {
            return this.estadoCivil;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setSexo(String sexo) {
            if (sexo == "F" || sexo == "M") {
                this.sexo = sexo;
            }
        }
    
        public void setDataNascimento(String dataDeNascimento) {
            this.dataDeNascimento = dataDeNascimento;
        }
    
        public void setEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
        }
    }
