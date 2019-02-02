//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#asInstanceOf[T0]:T0">scala.Any#asInstanceOf</a></li>
//<li name="scala.Any#asInstanceOf" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="asInstanceOf[T0]:T0"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#asInstanceOf[T0]:T0" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier">final </span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">asInstanceOf</span><span class="tparams">[<span name="T0">T0</span>]</span><span class="result">: <span class="extype" name="scala.Any.asInstanceOf.T0">T0</span></span> </span> <p class="shortcomment cmt">Cast the receiver object to be of type <code>T0</code>.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Cast the receiver object to be of type <code>T0</code>.</p>
//   <p> Note that the success of a cast at runtime is modulo Scala's erasure semantics. Therefore the expression <code>1.asInstanceOf[String]</code> will throw a <code>ClassCastException</code> at runtime, while the expression <code>List(1).asInstanceOf[List[String]]</code> will not. In the latter example, because the type argument is erased as part of compilation it is not possible to check whether the contents of the list are of the requested type. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>the receiver object.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../../Any.html" class="extype" name="scala.Any">Any</a>
//   </dd>
//   <dt>
//    Exceptions thrown
//   </dt>
//   <dd>
//    <span class="cmt"><p><a href="../../index.html#ClassCastException=ClassCastException" class="extmbr" name="scala.ClassCastException"><code>ClassCastException</code></a> if the receiver object is not an instance of the erasure of type <code>T0</code>.</p></span>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---












