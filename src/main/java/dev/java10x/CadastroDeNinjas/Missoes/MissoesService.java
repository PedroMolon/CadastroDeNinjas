package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public MissoesModel criarMissao(MissoesModel missao) {
            return missoesRepository.save(missao);
    }

    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    public MissoesModel listarMissaoPorId(Long id) {
        Optional<MissoesModel> missaoPorId = missoesRepository.findById(id);
        return missaoPorId.orElse(null);
    }

    public MissoesModel alterarNinjaPorId(Long id, MissoesModel missaoAlterada) {
        if (missoesRepository.existsById(id)) {
            missaoAlterada.setId(id);
            missoesRepository.save(missaoAlterada);
        }
        return null;
    }

    public void removerMissaoPorId(Long id) {
        missoesRepository.deleteById(id);
    }

}
