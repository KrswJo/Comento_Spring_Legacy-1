package mytld.mycompany.dao;

import mytld.mycompany.vo.MovieVO;

import java.util.List;

public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}
