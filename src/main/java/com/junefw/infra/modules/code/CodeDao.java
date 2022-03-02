package com.junefw.infra.modules.code;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


@Repository
public class CodeDao {
	
	@Inject
//	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.code.CodeMpp";

	//함수접근가능하게 퍼블릭 , 네임스페이스셀렉트리스트, 오브젝트는없고~
	public List <Code> selectList () { 
		return sqlSession.selectList( namespace + ".selectList", ""); 
	}
	
}