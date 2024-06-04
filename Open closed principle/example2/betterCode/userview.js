import viewtype from "./viewtype";

const profileview = ({user})=>{
    const profileview = viewtype.getprofileview(user.role);
    return <profileview user={user} />;
}

export default profileview;