const UserProfile = ({ user }) => {
    const displayInfo = () => {
        switch (user.role) {
            cas
                return <AdminView user={user} />;e 'admin':
            case 'editor':
                return <EditorView user={user} />;
            default:
                return <StandardView user={user} />;
        }
    };

    return <div>{displayInfo()}</div>;
};