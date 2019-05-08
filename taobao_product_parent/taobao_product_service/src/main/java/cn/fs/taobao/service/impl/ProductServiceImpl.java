package cn.fs.taobao.service.impl;

import cn.fs.taobao.domain.Product;
import cn.fs.taobao.mapper.ProductMapper;
import cn.fs.taobao.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author lyj
 * @since 2019-05-08
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
