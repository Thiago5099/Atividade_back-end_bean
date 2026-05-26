package com.example.hospital.controller;

import com.example.hospital.model.consulta;
import com.example.hospital.model.medico;
import com.example.hospital.model.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean")
public class BeanController {

    @Autowired
    private paciente paciente;

    @Autowired
    private consulta consulta;

    @Autowired
    private medico medico;

    @GetMapping("/paciente")
    public String getPaciente() {
        return "Paciente: " + paciente.getNome()
                + " | CPF: " + paciente.getCpf()
                + " | Telefone: " + paciente.getTelefone()
                + " | Tipo Sanguíneo: " + paciente.getProntuario().getTipoSanguineo()
                + " | Alergia: " + paciente.getProntuario().getAlergia()
                + " | Observações: " + paciente.getProntuario().getObservacoes();
    }

    @GetMapping("/consulta")
    public String getConsulta() {
        return "Consulta: " + consulta.getMotivo()
                + " | Data/Hora: " + consulta.getDataHora()
                + " | Valor: " + consulta.getValor();
    }

    @GetMapping("/medico")
    public String getMedico() {
        return "Médico: " + medico.getNome()
                + " | CRM: " + medico.getCrm()
                + " | Especialidade: " + medico.getEspecialidade();
    }
}
