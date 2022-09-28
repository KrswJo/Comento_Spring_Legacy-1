package mytld.mycompany.service;

import mytld.mycompany.dao.MovieDAO;
import mytld.mycompany.vo.MovieVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    @Inject
    private MovieDAO dao;

    @Override
    public List<MovieVO> selectMovie() throws Exception {

        return dao.selectMovie();
    }
}
