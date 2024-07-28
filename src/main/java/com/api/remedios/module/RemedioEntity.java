package com.api.remedios.module;

import java.util.UUID;

import com.api.remedios.dto.DadosCadastroRemedioDTO;
import com.api.remedios.enums.Laboratorio;
import com.api.remedios.enums.Via;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity(name = "remedios")
@Table(name = "Remedio")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Data
public class RemedioEntity {

  public RemedioEntity(DadosCadastroRemedioDTO dados) {
    this.nome = dados.nome();
    this.via = dados.via();
    this.lote = dados.lote();
    this.quantidade = dados.quantidade();
    this.dataValidade = dados.dataValidade();
    this.laboratorio = dados.laboratorio();
}

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String nome;

  @Enumerated(EnumType.STRING)
  private Via via;

  private String lote;
  private String quantidade;
  private String dataValidade;

  @Enumerated(EnumType.STRING)
  private Laboratorio laboratorio;



}
