package com.option.chain.analysis.repository;

import java.time.Instant;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Repository;

import com.option.chain.analysis.model.OpJsonData;

@Repository
public interface OptionChainRepository extends JpaRepository<OpJsonData, Integer> {

	/*
	 * @Query("select * from Option_Chain t where symbol :symbol order by id desc FETCH FIRST :lim ROWS ONLY"
	 * ) public List<OpJsonData> findBySymbol(@Param("symbol") String
	 * symbol,@Param("lim") Integer lim);
	 */
	
	/*
	 * @Query("select * from Option_Chain  where symbol =:symbol order by id desc FETCH FIRST 1 ROWS ONLY"
	 * ) public List<OpJsonData> findOpJsonDataBySymbol(@Param("symbol") String
	 * symbol);
	 */
	
	/*
	 * @Query("select * from Option_Chain where SYMBOL ='NIFTY'") List<OpJsonData>
	 * findBySymbolOrderByIdAsc(String symbol);
	 */
	
	/*
	 * @Query("select * from Option_Chain d where d.LAST_UPDATED_TIME <= :'07-12-20 03:23:47.325949000 AM'"
	 * ) List<OpJsonData> findAllWithDatetimeBefore(
	 * 
	 * @Param("datetime") String string);
	 */
	
	
	/*
	 * @Query("FROM OpJsonData WHERE symbol = ?1 ORDER BY Id ASC") List<OpJsonData>
	 * findBySymbolOrderById(String symbol);
	 */
	 
	
	
	/*
	 * @Query("FROM OpJsonData WHERE symbol = ?1 AND lastUpdatedTime = ?2 ORDER BY Id DESC"
	 * ) List<OpJsonData> findBySymbolAndLastUpdatedTimeOrderById(String
	 * symbol,Instant lastUpdatedTime);
	 */
	 
	/*
	 * @Query("FROM OpJsonData WHERE lastUpdatedTime = ?1 ORDER BY Id DESC")
	 * List<OpJsonData> findByLastUpdatedTime();
	 */
	  
	
	//  <T> Collection<T> findBySymbol(String lastname, Class<T> type);
	  
	  <T> Collection<T> findBySymbolOrderByIdDesc(String symbol, Class<T> type);
	 
	  
		/*
		 * @Query(nativeQuery = true, value =
		 * "FROM OpJsonData WHERE symbol = :symbol ORDER BY Id DESC") <T> Collection<T>
		 * findBySymbolOrderByIdDesc( String symbol,Class<T> type);
		 */
	  
	  
	    public final static String FIND_BY_ADDRESS_QUERY ="SELECT b FROM OpJsonData b WHERE b.symbol = :symbol and LAST_UPDATED_TIME >= CAST(CURRENT_TIMESTAMP-1 as date)order by id desc";
	  
	  @Query(FIND_BY_ADDRESS_QUERY)
	  List<OpJsonData>  findSymbolByLastUpdatedTimeEqual(@Param("symbol") String symbol);
	  
	//  @Query("Select c from OpJsonData c where c.symbol = :symbol and c.lastUpdatedTime = :lastUpdatedTime > CURRENT_TIMESTAMP-1 order by id desc")
	//  @Query(value ="Select c from OpJsonData c where c.symbol = 1? and c.lastUpdatedTime >= lastUpdatedTime-1 order by id desc", nativeQuery = true)
	//  OpJsonData findSymbolByLastUpdatedTimeEqual(@Param("symbol") String symbol, @Param("lastUpdatedTime") Instant lastUpdatedTime);
	  
	 
	  @Query(value ="select * from Option_Chain st where st.LAST_UPDATED_TIME >= ?1", nativeQuery = true)
	    List<OpJsonData> getData(@Param("lastUpdatedTime") @DateTimeFormat(iso = ISO.DATE) String lastUpdatedTime);
}
