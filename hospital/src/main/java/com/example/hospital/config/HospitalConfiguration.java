package com.example.hospital.config;

import com.example.hospital.model.consulta;
import com.example.hospital.model.convenio;
import com.example.hospital.model.medico;
import com.example.hospital.model.paciente;
import com.example.hospital.model.prontuario;
import com.example.hospital.model.receita;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HospitalConfiguration {

    @Bean
    public prontuario prontuario() {
        prontuario p = new prontuario();
        p.setTipoSanguineo("O+");
        p.setAlergia("Penicilina");
        p.setObservacoes("Paciente hipertenso. Monitorar pressão arterial regularmente.");
        return p;
    }

    @Bean
    public receita receita() {
        receita r = new receita();
        r.setMedicamento("Losartana 50mg");
        r.setDosagem("1 comprimido ao dia");
        r.setDuracaoDias(30);
        return r;
    }

    @Bean
    public convenio convenio() {
        convenio c = new convenio();
        c.setNome("Unimed");
        c.setCnpj("12.345.678/0001-99");
        return c;
    }

    @Bean
    public medico medico() {
        medico m = new medico();
        m.setNome("Dr. Carlos Souza");
        m.setEspecialidade("Cardiologia");
        m.setCrm("CRM/SP 123456");
        return m;
    }

    @Bean
    public consulta consulta(paciente paciente, convenio convenio, receita receita) {
        consulta c = new consulta();
        c.setDataHora("2026-05-26T10:00:00");
        c.setMotivo("Consulta de rotina cardiológica");
        c.setValor("R$ 250,00");
        return c;
    }

    @Bean
    public paciente paciente(prontuario prontuario) {
        paciente p = new paciente();
        p.setNome("João da Silva");
        p.setCpf("123.456.789-00");
        p.setTelefone("(11) 91234-5678");
        p.setProntuario(prontuario);
        return p;
    }
}
