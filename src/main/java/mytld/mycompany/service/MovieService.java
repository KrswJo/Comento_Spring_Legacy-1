package mytld.mycompany.service;

import mytld.mycompany.vo.MovieVO;

import java.util.List;

public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}
