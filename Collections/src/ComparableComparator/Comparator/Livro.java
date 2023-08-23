package ComparableComparator.Comparator;

import java.util.Objects;

public class Livro implements Comparable<Livro>{
    private Long id;
    private String nome;
    private Integer ano;

    public Livro(Long id, String nome, Integer ano) {
        Objects.requireNonNull(id,"O ID não pode ser null");
        this.id = id;
        this.nome = nome;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id) && Objects.equals(nome, livro.nome) && Objects.equals(ano, livro.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ano);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public int compareTo(Livro o) {
        /*
        * O método compareTo tem acesso a dois objetos
        * 1º é o objeto this que está executando o compareto
        * 2º é o objeto o, passado como parâmetro
        *
        * Regra: retorna
        * Negativo se o this < "o"
        * se this == o, return "o"
        * Positivo se o this > "o"
        *
        *  if(this.id<o.getId()){
            return -1;
        }else if(this.id.equals(o.getId())){
            return 0;
        }else{
            return 1;
        }
        *
        * */
       return this.nome.compareTo(o.getNome());
    }
}
